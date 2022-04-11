import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-staff-form',
  templateUrl: './staff-form.component.html',
  styleUrls: ['./staff-form.component.css']
})
export class StaffFormComponent implements OnInit {

  constructor(private addstaff:AppServiceService) { }
  user={
     code:"",
		 employeeName:"",
	   employeeAddress:"",
		 nic:"",
		 salary:"",
		 nameAge:"",
		 occupation:"",
	  email:""
  };
  ngOnInit(): void {
  }
  onSubmit(data:any)
  {
    this.user=data;
    console.log(this.user);
    
    this.addstaff.insertstaff(this.user)
                  .subscribe((res:any)=>{console.log(res);}
    
    );
  }

}
