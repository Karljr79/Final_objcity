import saito.objloader.*;
import peasy.*;
import controlP5.*;

ControlP5 cp5;
Button yawButton, freeButton, rollButton, pitchButton, enableButton, disableButton;
Button preview1, preview2, preview3,preview4, preview5, preview6, preview7, preview8, previewW, previewP;
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnp, btnw;
CallbackListener c1,c2,c3,c4,c5,c6,c7,c8,cw,cp;

PeasyCam cam;
OBJModel cursormodel;

int ROW, COL;
int startX = -240;
int startZ = -80;
int step = 80;
int numRows = 5;
int numCols = 5;
int buttonX = 615;
int buttonY = 40;
int buttonsizeX = 80;
int buttonsizeY = 30;
int buttonsizeXL = 165;
int buttonsizeYL = 30;
int[] posXval = new int[numRows];
int[] posZval = new int[numCols];

Position[][] pos = new Position[numRows][numCols];

void setup()
{
  size(800,800,P3D);
  frameRate(30);
  cam = new PeasyCam(this,700);
  cam.setMinimumDistance(300);
  cam.setMaximumDistance(750);
  cam.rotateX(70);
  cam.setActive(false);
  cursormodel = new OBJModel(this, "cursor.obj", "relative", TRIANGLES);
  cursormodel.scale(8);
  noStroke();
  SetUpListeners();
  SetUpUI(); //calling set up UI function
  setUpArrays();
  Disable_Camera();
}

void draw()
{
  background(60);
  lights();
  pushMatrix();
  popMatrix();
  pushMatrix();
  translate(ColValue(),0, RowValue());
  cursormodel.draw();
  popMatrix();
  drawAllModels();
  cam.beginHUD();
  cp5.draw();
  cam.endHUD();
}

int ColValue()
{
  if ( COL == 0 )
    return -240;
  else if ( COL == 1 )
    return -160;
  else if ( COL == 2 )
    return -80;
  else if ( COL == 3 )
    return 0;
  else
    return 80;  
}

int RowValue()
{
  if ( ROW == 0 )
    return -80;
  else if ( ROW == 1 )
    return 0;
  else if ( ROW == 2 )
    return 80;
  else if ( ROW == 3 )
    return 160;
  else
    return 240;
}
