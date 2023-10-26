package controllers

import play.api.mvc.Results.Redirect
import play.api.mvc.{BaseController, ControllerComponents}


import javax.inject.Inject

class TaskList @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

 def taskList = Action {
  val task = List("task1", "task2", "task3", "task4")
  Ok(views.html.taskList(task))
 }

 def validateLoginGet(username:String,password:String)=Action{
  Ok(s"$username log in with $password")
 }




// def validateLoginPost= Action { request =>
//  val postVals=request.body.asFormUrlEncoded // it return Option[List[...]]
//  postVals.map { args =>
//   val username = args("username").head
//   val password = args("password").head
//   Redirect(routes.TaskList.taskList())
//  }.getOrElse(Redirect(routes.TaskList.login()))
////  }.getorElse(Redirect(routes.TaskList1.login()))
// }



 def login = Action {
  Ok(views.html.login())
 }
}

