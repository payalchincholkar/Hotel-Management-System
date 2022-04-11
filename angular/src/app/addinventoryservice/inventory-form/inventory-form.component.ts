import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-inventory-form',
  templateUrl: './inventory-form.component.html',
  styleUrls: ['./inventory-form.component.css']
})
export class InventoryFormComponent implements OnInit {

  constructor(private addinventory:AppServiceService) { }
  user={
    id:"",
	  beds:"",
	  tables:"",
	  chairs:"",
	  pillow:"",
	  bedsheet:"",
	  mattress:""
  };
  ngOnInit(): void {
  }
  onSubmit(data:any)
  {
    this.user=data;
    console.log(this.user);
    
    this.addinventory.insertinventory(this.user)
                  .subscribe((res:any)=>{console.log(res);}
    
    );
  }

}
