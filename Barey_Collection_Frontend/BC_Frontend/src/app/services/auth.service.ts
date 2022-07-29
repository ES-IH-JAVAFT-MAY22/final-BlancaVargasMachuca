import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';



@Injectable({
  providedIn: 'root'
})
export class AuthService {
  
  readonly API_URL = 'http://localhost:8080';

  constructor(
    private http: HttpClient
  ) { }

  isAuthenticated(): boolean {
    const token: string | null = localStorage.getItem('currentUser');
    return token !== null;
  }

  register(user : User ): Observable<User> {
    return this.http.post<User>(`${this.API_URL}/users`, user);
  }

  login(username: string, password: string): Observable<User> {
   console.log(username , password)
    let headers = new HttpHeaders();
    headers = headers.append('Authorization', 'Basic ' + btoa(`${username}:${password}`));
    console.log({headers: headers})
    return this.http.get<User>(`${this.API_URL}/login`, { headers: headers });
  }


logout(): void {
    // Remove user from local storage to log user out
    localStorage.removeItem('currentUser');

    //Aquí poner get
   // getTeam(trainerId: number): Observable<any>{
   //   return this.http.get(`${this.API_URL}/teams/${trainerId}`);
}
}