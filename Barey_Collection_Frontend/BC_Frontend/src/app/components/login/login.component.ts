import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //user: User;
  username  = '';
  password = '';

  constructor(private authService: AuthService, private router: Router) { 

    
  }
 
 
  ngOnInit() {
    
  }

 
  login(): void{
    let username = this.username;
    let password = this.password;

    console.log(username, password);
    if (username == null || password == null){
      console.log('Error login', 'Usuario o Contraseña vacia!', 'error')
    }
    this.authService.login(username, this.password).subscribe(user => {
      console.log('Login', 'Hola: '+ username, 'success');
      // Store user in local storage to keep user logged in between page refreshes
      localStorage.removeItem('currentUser');
      localStorage.setItem('currentUser', JSON.stringify(user));
      this.router.navigate(['/'])
    },err =>{
      if(err.status == 400){
        console.log('ERROR al intentar acceder a la APP');
      }
    });

  }
}