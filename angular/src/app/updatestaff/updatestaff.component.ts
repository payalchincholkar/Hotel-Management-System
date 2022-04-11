import { StaffEntity } from './../staff';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-updatestaff',
  templateUrl: './updatestaff.component.html',
  styleUrls: ['./updatestaff.component.css']
})
export class UpdatestaffComponent implements OnInit {
  code:string="";

  staff:StaffEntity = new StaffEntity();
  constructor(private updatestaffs:AppServiceService,
    private route:ActivatedRoute ,
    private router:Router){} 
  ngOnInit(): void {
    console.log(this.staff);
    
    this.code= this.route.snapshot.params['code'];
    this.updatestaffs.getstaffById(this.code).subscribe((result)=>{
      console.log(result);
      this.staff = result;
      
    })
  }
  update()
   {
     
     this.updatestaffs.updatestaff(this.code,this.staff).subscribe((data)=>{
      this.goToUpdate();
      

     }
    
      );
   }
   goToUpdate()
   {
     this.router.navigate(['/admin/manager/staff-service']);
   }

}
