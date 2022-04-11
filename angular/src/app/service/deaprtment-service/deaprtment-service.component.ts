import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-deaprtment-service',
  templateUrl: './deaprtment-service.component.html',
  styleUrls: ['./deaprtment-service.component.css']
})
export class DeaprtmentServiceComponent implements OnInit {

  depart:any
  constructor(private departservice:AppServiceService,
    private router:Router) {
  
  departservice.getdepart().subscribe((data)=>this.depart=data);
   }

  ngOnInit(): void {
  }
  deletedepart(code:any)
  {
    this.departservice.deletedepart(code).subscribe((res:any)=>console.log(res));
  }
}
