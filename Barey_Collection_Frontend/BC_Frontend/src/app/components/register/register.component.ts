import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { CustomValidators } from 'src/app/utils/custom.validations';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;
  usernameInput: FormControl;
  passwordInput: FormControl;
  passwordConfirmationInput: FormControl;
  user!: User;

  constructor(
    private authService: AuthService,
    private router: Router
  ) {
    this.usernameInput = new FormControl('', [Validators.required]);
    this.passwordInput = new FormControl('', [Validators.required]);
    this.passwordConfirmationInput = new FormControl('', [Validators.required]);
    this.registerForm = new FormGroup({
      username: this.usernameInput,
      password: this.passwordInput,
      passwordConfirmation: this.passwordConfirmationInput
    }, [CustomValidators.passwordMatch]);
  }

  ngOnInit(): void {
  }

  register() {
    this.authService.register(this.user ).subscribe(
      (user) => {
        alert('Register successful');
        console.log(user);

        // Redirect to home page
        this.router.navigate(['/login']);
      },
      (error) => {
        alert('Register failed');
        console.log(error);
      }
    );
  }


}