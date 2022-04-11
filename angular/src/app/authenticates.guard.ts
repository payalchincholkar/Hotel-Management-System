import { AppServiceService } from 'src/app/app-service.service';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { JsonpClientBackend } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenticatesGuard implements CanActivate {

  constructor(private router : Router){

  }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      // var token = JSON.parse(localStorage)
      if(localStorage.getItem('token'))
      {
          return true;
      }
      else
      {
        this.router.navigate[''];
        return false;
      }
    
  }
  
}
