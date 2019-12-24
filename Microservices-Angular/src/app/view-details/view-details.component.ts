import { Component, OnInit,ViewChild } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';

import { User } from '../models/user.model';
import { UserService } from '../user/user.service';


@Component({
  selector: 'app-view-details',
  templateUrl: './view-details.component.html',
  styleUrls: ['./view-details.component.css']
})
export class ViewDetailsComponent implements OnInit {

  user:User;
  id:any;
  constructor(private router: Router, private route: ActivatedRoute,private userService:UserService) {
  }
  ngOnInit() {
    this.id=this.route.snapshot.params['id'];
    this.userService.getUser(this.id).subscribe(data=>{
      this.user=data
    });
  
  }
  back(){
    this.router.navigate(['/']);
  }

}

