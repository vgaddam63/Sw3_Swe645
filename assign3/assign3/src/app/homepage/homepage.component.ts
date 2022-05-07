import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor(private router: Router) { }

  Survey(){

    // console.log("student id is:"+param);
    this.router.navigate(['/survey']);
  }

  Acknowledge(){

    // console.log("student id is:"+param);
    this.router.navigate(['/acknowledge']);
  }

  ngOnInit(): void {
  }

}
