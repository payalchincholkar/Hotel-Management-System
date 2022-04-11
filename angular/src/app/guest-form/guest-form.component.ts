import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppServiceService } from '../app-service.service';
import { PaymentFormComponent } from '../payment-form/payment-form.component';

@Component({
  selector: 'app-guest-form',
  templateUrl: './guest-form.component.html',
  styleUrls: ['./guest-form.component.css']
})
export class GuestFormComponent implements OnInit {

  constructor(private addguest:AppServiceService,private router:Router) { }
  user={
    memberCode:"",
    phoneNumber:"",
    company:"",
		 name:"",
     email:"" ,
     gender:"",
     address:""
  };
  pay;
  amt;
  ngOnInit(): void {
  }
  onAdd(data:any)
  {
    this.user=data;
    console.log(this.user);
    
    this.addguest.insertguest(this.user)
                  .subscribe((res:any)=>{
                    if(res)
                    {
                                                
                      this.addguest.tnscreate(this.amt).subscribe((transres)=>{
                        var trans1 = JSON.stringify(transres);
                        this.pay = JSON.parse(trans1);
                               console.log("order created");
                               
                        if(this.pay.status=="created")
                        {
                          
                          let options = {
                            key : "rzp_test_3dVBVuTuawUAhi",
                            amount : this.pay.amount,
                            currency:"INR",
                            name:"Payment for care vision",
                            description:"pay for your service",
                            image:"",
                            order_id:this.pay.id,
                            handler:function(response){
                              console.log(response.razorpay_payment_id);
                              console.log(response.razorpay_order_id);
                              console.log(response.razorpay_signature);
                              alert("payment successfull.");
                              // this.paystatus="success"
                            },
                            prefill: {
                              name: this.user.name,
                              email: this.user.email,
                              contact: this.user.phoneNumber
                            },
                            notes: {
                              "address": "care-vision private LTD"
                            },
                            theme: {
                              "color": "#3399cc"
                            }
                          };
                          var rzp = new this.addguest.nativeWindow.Razorpay(options);
                          rzp.on('payment.failed', function (response){
                            console.log(response.error.code);
                            console.log(response.error.description);
                            console.log(response.error.source);
                            console.log(response.error.step);
                            console.log(response.error.reason);
                            console.log(response.error.metadata.order_id);
                            console.log(response.error.metadata.payment_id);
                            this.paystatus="failed";
                            alert("Oops!!! payment failed...")
                          });
                          rzp.open();
                          
                          
                        } 
                      });
                      
                    }


                    }
    
    );
  }

}
