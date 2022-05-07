import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SurveyComponent} from './survey/survey.component';
import { AcknowledgeComponent } from './acknowledge/acknowledge.component';
import { ReadSurveyComponent } from './read-survey/read-survey.component';
import { HomepageComponent } from './homepage/homepage.component';


const routes: Routes = [{path: '', component: HomepageComponent},
{path: 'survey', component: SurveyComponent},
{path: 'acknowledge', component: AcknowledgeComponent},
{path: 'readSurvey', component: ReadSurveyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
