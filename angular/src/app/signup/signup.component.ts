import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { AppServiceService } from '../app-service.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  credentials={
    username:'',
    password:'',
    role:''
  }
 

  constructor(private signup:AppServiceService,private router:Router) { }

  ngOnInit(): void {
  }
  
  onSubmit(data:any)
  {
    this.credentials=data;
    console.log("form is submit");
    console.log(this.credentials);
    
    this.signup.authreg(this.credentials).subscribe((res:any)=>{
      if(res)
      {
        this.router.navigate(["login"]);
      }
    })
  }
}
