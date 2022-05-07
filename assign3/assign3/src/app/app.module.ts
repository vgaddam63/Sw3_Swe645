import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule,ReactiveFormsModule}  from '@angular/forms'
import { AppComponent } from './app.component';
import { SurveyComponent } from './survey/survey.component';
import { HttpClientModule }    from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AcknowledgeComponent } from './acknowledge/acknowledge.component';
import { ReadSurveyComponent } from './read-survey/read-survey.component';
import { HomepageComponent } from './homepage/homepage.component';


@NgModule({
  declarations: [
    AppComponent,
    SurveyComponent,
    AcknowledgeComponent,
    ReadSurveyComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
