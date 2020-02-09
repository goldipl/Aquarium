package controller;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;


public class AnimationWindowController {
	  private Stage primaryStage;

  @FXML Group fish;
  @FXML Group fish1;
  @FXML ImageView imageView;

  
  Animation animation;
  
 
  public void animation(){
		  
		  Path animationPath2 = new Path();
		  MoveTo moveTo2 = new MoveTo(0,0);
		  CubicCurveTo sineCurve2 = new CubicCurveTo(0,-450,450,250,700,0);
		  animationPath2.getElements().addAll(moveTo2, sineCurve2);
		  
		  Path animationPath3 = new Path();
		  MoveTo moveTo3 = new MoveTo(0,0);
		  CubicCurveTo sineCurve3 = new CubicCurveTo(0,-450,450,250,700,0);
		  animationPath3.getElements().addAll(moveTo3, sineCurve3);
		  
		  PathTransition transition = new PathTransition();
		  transition.setNode(fish);
		  transition.setDuration(Duration.seconds(5));
		  transition.setPath(animationPath2);
		  transition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		  transition.setInterpolator(Interpolator.LINEAR);
		  //transition.setCycleCount(Animation.INDEFINITE);
		  transition.setAutoReverse(true);
		  
		  PathTransition transition2 = new PathTransition();
		  transition2.setNode(fish1);
		  transition2.setDuration(Duration.seconds(5));
		  transition2.setPath(animationPath2);
		  transition2.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		  transition2.setInterpolator(Interpolator.LINEAR);
		  //transition2.setCycleCount(Animation.INDEFINITE);
		  transition2.setAutoReverse(true);

		  
		  SequentialTransition sequ = new SequentialTransition(transition,transition2);
		  animation = sequ;
	  }

  
  @FXML public void closeAnimationWindow(){
	  primaryStage.close();
  }
  
  @FXML public void playAnimation(){
	  animation.play();
  }
  
  @FXML public void pauseAnimation(){
	  animation.pause();
  }
  
  @FXML public void stopAnimation(){
	  animation.stop();
  }
  
 public void setStage(Stage primaryStage){
	 this.primaryStage=primaryStage;
 }

public void setMain(Main main) {

}

}
