import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
credentials={
  username:'',
  password:'',
  role:''
}
  constructor(private login:AppServiceService,private router: Router) { }

  ngOnInit(): void {
    
  }

onSubmit(data:any)
{
  this.credentials=data;
  console.log("form is submit");
  this.login.authcheack
  (this.credentials).subscribe((res:any)=>{
      localStorage.setItem("token",JSON.stringify(res));
      if(res)
      {
        var token = JSON.parse(localStorage.getItem("token"));
        console.log(token.role);
        if(token.role=="[manager]")
        {
          this.router.navigate(['admin/manager'])
          
        }
        else if(token.role=="[owner]")
        {
          this.router.navigate(['admin/owner']);
        }
        else if(token.role=="[receptionist]")
        {
          this.router.navigate(['admin/receptionist'])
        }
        
        
      }
  })
}

}
