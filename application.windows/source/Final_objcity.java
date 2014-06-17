import processing.core.*; 
import processing.xml.*; 

import saito.objloader.*; 
import peasy.*; 
import controlP5.*; 
import saito.objloader.*; 
import saito.objloader.*; 

import peasy.test.*; 
import peasy.org.apache.commons.math.*; 
import peasy.*; 
import controlP5.*; 
import peasy.org.apache.commons.math.geometry.*; 
import saito.objloader.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Final_objcity extends PApplet {





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

public void setup()
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

public void draw()
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

public int ColValue()
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

public int RowValue()
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
public void Enable_Camera()
{
  cam.setActive(true);
  disableButton.setSwitch(false);
  enableButton.setSwitch(true);
}

public void Load_City()
{
  String loadpath = selectInput("Get Me a City File......");
  String[] cityfile = loadStrings(loadpath);
  int count = 0;
  int t;
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
        t = PApplet.parseInt(cityfile[count]);
        switch(t)
        {
          case 1:
            pos[i][j].setModel("bldg1.obj");
            break;
          case 2:
            pos[i][j].setModel("bldg2.obj");
            break;
          case 3:
            pos[i][j].setModel("bldg3.obj");
            break;
          case 4:
            pos[i][j].setModel("bldg4.obj");
            break;
          case 5:
            pos[i][j].setModel("bldg5.obj");
            break;
          case 6:
            pos[i][j].setModel("bldg6.obj");
            break;
          case 7:
            pos[i][j].setModel("bldg7.obj");
            break;
          case 8:
            pos[i][j].setModel("bldg8.obj");
            break;
          case 9:
            pos[i][j].setModel("bldg_water.obj");
            break;
          case 10:
            pos[i][j].setModel("bldg_park.obj");
            break;
          default:
            pos[i][j].setModel("blank.obj");
            break;
        }
        count++;
     }
     drawAllModels();
    }
}

public void Save_City()
{
  String[] citysavefile = new String[25];; 
  int count = 0;
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      citysavefile[count] = pos[i][j].getData();
      println(citysavefile[count]);
      count++;
    }
  }
  saveStrings("save/testcity.txt", citysavefile);
}

public void Disable_Camera()
{
  cam.setActive(false);
  disableButton.setSwitch(true);
  enableButton.setSwitch(false);
}

public void setYaw()
{
  cam.setYawRotationMode();
  yawButton.setSwitch(true);
  pitchButton.setSwitch(false);
  rollButton.setSwitch(false);
  freeButton.setSwitch(false);
  
}

public void setPitch()
{
  cam.setPitchRotationMode();
  pitchButton.setSwitch(true);
  rollButton.setSwitch(false);
  freeButton.setSwitch(false);
  yawButton.setSwitch(false);
}

public void setRoll()
{
  cam.setRollRotationMode();
  yawButton.setSwitch(false);
  pitchButton.setSwitch(false);
  rollButton.setSwitch(true);
  freeButton.setSwitch(false);
}

public void setFree()
{
  cam.setFreeRotationMode();
  yawButton.setSwitch(false);
  pitchButton.setSwitch(false);
  rollButton.setSwitch(false);
  freeButton.setSwitch(true);
}

public void BLDG1()
{
  pos[COL][ROW].setModel("bldg1.obj");
  pos[COL][ROW].setData("1");
}

public void BLDG2()
{
  pos[COL][ROW].setModel("bldg2.obj");
  pos[COL][ROW].setData("2");
}

public void BLDG3()
{
  pos[COL][ROW].setModel("bldg3.obj");
  pos[COL][ROW].setData("3");
}

public void BLDG4()
{
  pos[COL][ROW].setModel("bldg4.obj");
  pos[COL][ROW].setData("4");
}

public void BLDG5()
{
  pos[COL][ROW].setModel("bldg5.obj");
  pos[COL][ROW].setData("5");
}

public void BLDG6()
{
  pos[COL][ROW].setModel("bldg6.obj");
  pos[COL][ROW].setData("6");
}

public void BLDG7()
{
  pos[COL][ROW].setModel("bldg7.obj");
  pos[COL][ROW].setData("7");
}

public void BLDG8()
{
  pos[COL][ROW].setModel("bldg8.obj");
  pos[COL][ROW].setData("8");
}

public void PARK()
{
  pos[COL][ROW].setModel("bldg_park.obj");
  pos[COL][ROW].setData("10");
}

public void WATER()
{
  pos[COL][ROW].setModel("bldg_water.obj");
  pos[COL][ROW].setData("9");
}

public void RIGHT()
{
  if (COL == numCols - 1)
    COL = 0;
  else 
    COL++;
}

public void LEFT()
{
  if (COL == 0)
    COL = numCols - 1;
  else 
    COL--;
}

public void DOWN()
{
  if (ROW == numRows - 1)
    ROW = 0;
  else 
    ROW++;
}

public void UP()
{
  if (ROW == 0)
    ROW = numRows - 1;
  else
    ROW--;
}

public void ROTATE()
{
  pos[COL][ROW].setRot(radians(90.00f));
}

 
class Object
{
  OBJModel model;
   
  Object(PApplet _applet, String model_name)
  {
    model = new OBJModel(_applet, model_name, "relative", TRIANGLES);
    model.disableDebug();
    model.scale(8);
  }
}



public class Position
{
  Object theModel;
  public int x;
  public int y;
  public int z;
  public float rotY;
  public String userData;
  
  public Position(PApplet _applet)
  {
    theModel = new Object(_applet, "blank.obj");
    this.x = 0;
    this.y = 0;
    this.z = 0;
    this.rotY = 0.0f;
    userData = "0";
  }
  
  public Position(PApplet _applet, int x, int y, int z)
  {
    theModel = new Object(_applet, "blank.obj");
    this.x = x;
    this.y = y;
    this.z = z;
    this.rotY = 0.0f;
    userData = "0";
  }
  
  public void setPos(int x, int y, int z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public void setRot(float rotation)
  {
    if (this.rotY >=360)
    {
      this.rotY = 0.0f;
    }
    this.rotY += rotation;
  }
  
  public void setData(String data)
  {
    this.userData = data;
  }
  
  public void setModel(String model_name)
  {
    theModel.model.reset();
    theModel.model.load(model_name);
    theModel.model.scale(8);
  }
  
  public String getData()
  {
    return userData;
  }
  
  public void drawmodel()
  {
    pushMatrix();
    translate(x,y,z);
    rotateY(rotY);
    theModel.model.draw();
    popMatrix();
  }
}

public void drawAllModels()
{
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      pos[i][j].drawmodel();
    }
  }
  
}
public void setUpArrays()
{
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      posXval[j] = startX + step * j;
    }
    posZval[i] = startZ + step * i;
  }
  
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      pos[i][j] = new Position(this, posXval[i], 0, posZval[j]);
    }
  }
  
}
public void SetUpListeners()
{
  c1 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview1.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview1.setVisible(false);
          break;
      }
    }
  };
  
  c2 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview2.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview2.setVisible(false);
          break;
      }
    }
  };
  
  c3 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview3.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview3.setVisible(false);
          break;
      }
    }
  };
  
  c4 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview4.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview4.setVisible(false);
          break;
      }
    }
  };
  
  c5 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview5.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview5.setVisible(false);
          break;
      }
    }
  };
  
  c6 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview6.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview6.setVisible(false);
          break;
      }
    }
  };
  
  c7 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview7.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview7.setVisible(false);
          break;
      }
    }
  };
  
  c8 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview8.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview8.setVisible(false);
          break;
      }
    }
  };
  
  cp = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          previewP.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          previewP.setVisible(false);
          break;
      }
    }
  };
  
  cw = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          previewW.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          previewW.setVisible(false);
          break;
      }
    }
  };
}
public void SetUpUI()
{
  PImage[] img_right = {loadImage("btnR_idle.png"),loadImage("btnR_over.png"),loadImage("btnR_click.png")};
  PImage[] img_left = {loadImage("btnL_idle.png"),loadImage("btnL_over.png"),loadImage("btnL_click.png")};
  PImage[] img_up = {loadImage("btnU_idle.png"),loadImage("btnU_over.png"),loadImage("btnU_click.png")};
  PImage[] img_down = {loadImage("btnD_idle.png"),loadImage("btnD_over.png"),loadImage("btnD_click.png")};
  PImage[] img_rot = {loadImage("btnRot_idle.png"),loadImage("btnRot_over.png"),loadImage("btnRot_click.png")};
  PImage[] img_enable = {loadImage("btnEnable_idle.png"),loadImage("btnEnable_over.png"),loadImage("btnEnable_click.png"), loadImage("btnEnable_active.png")};
  PImage[] img_disable = {loadImage("btnDisable_idle.png"),loadImage("btnDisable_over.png"),loadImage("btnDisable_click.png"), loadImage("btnDisable_active.png")};
  PImage[] img_free = {loadImage("btnFree_idle.png"),loadImage("btnFree_over.png"),loadImage("btnFree_click.png"), loadImage("btnFree_active.png")};
  PImage[] img_pitch = {loadImage("btnPitch_idle.png"),loadImage("btnPitch_over.png"),loadImage("btnPitch_click.png"),loadImage("btnPitch_active.png")};
  PImage[] img_roll = {loadImage("btnRoll_idle.png"),loadImage("btnRoll_over.png"),loadImage("btnRoll_click.png"), loadImage("btnRoll_active.png")};
  PImage[] img_yaw = {loadImage("btnYaw_idle.png"),loadImage("btnYaw_over.png"),loadImage("btnYaw_click.png"), loadImage("btnYaw_active.png")};
  PImage[] img_load = {loadImage("btnLoad_idle.png"),loadImage("btnLoad_over.png"),loadImage("btnLoad_click.png")};
  PImage[] img_save = {loadImage("btnSave_idle.png"),loadImage("btnSave_over.png"),loadImage("btnSave_click.png")};
  PImage[] img_preview = {loadImage("preview_back.png"),loadImage("preview_back.png"),loadImage("preview_back.png")};
  PImage[] img1 = {loadImage("btn1_idle.png"),loadImage("btn1_over.png"),loadImage("btn1_click.png")};
  PImage[] img2 = {loadImage("btn2_idle.png"),loadImage("btn2_over.png"),loadImage("btn2_click.png")};
  PImage[] img3 = {loadImage("btn3_idle.png"),loadImage("btn3_over.png"),loadImage("btn3_click.png")};
  PImage[] img4 = {loadImage("btn4_idle.png"),loadImage("btn4_over.png"),loadImage("btn4_click.png")};
  PImage[] img5 = {loadImage("btn5_idle.png"),loadImage("btn5_over.png"),loadImage("btn5_click.png")};
  PImage[] img6 = {loadImage("btn6_idle.png"),loadImage("btn6_over.png"),loadImage("btn6_click.png")};
  PImage[] img7 = {loadImage("btn7_idle.png"),loadImage("btn7_over.png"),loadImage("btn7_click.png")};
  PImage[] img8 = {loadImage("btn8_idle.png"),loadImage("btn8_over.png"),loadImage("btn8_click.png")};
  PImage[] img_water = {loadImage("waterbtn_idle.png"),loadImage("waterbtn_over.png"),loadImage("waterbtn_click.png")};
  PImage[] img_park = {loadImage("parkbtn_idle.png"),loadImage("parkbtn_over.png"),loadImage("parkbtn_click.png")};
  PImage[] park_pre = {loadImage("prev_park.png"),loadImage("prev_park.png"),loadImage("prev_park.png")};
  PImage[] water_pre = {loadImage("prev_water.png"),loadImage("prev_water.png"),loadImage("prev_water.png")};
  PImage[] bldg1_pre = {loadImage("prev_bldg1.png"),loadImage("prev_bldg1.png"),loadImage("prev_bldg1.png")};
  PImage[] bldg2_pre = {loadImage("prev_bldg2.png"),loadImage("prev_bldg2.png"),loadImage("prev_bldg2.png")};
  PImage[] bldg3_pre = {loadImage("prev_bldg3.png"),loadImage("prev_bldg3.png"),loadImage("prev_bldg3.png")};
  PImage[] bldg4_pre = {loadImage("prev_bldg4.png"),loadImage("prev_bldg4.png"),loadImage("prev_bldg4.png")};
  PImage[] bldg5_pre = {loadImage("prev_bldg5.png"),loadImage("prev_bldg5.png"),loadImage("prev_bldg5.png")};
  PImage[] bldg6_pre = {loadImage("prev_bldg6.png"),loadImage("prev_bldg6.png"),loadImage("prev_bldg6.png")};
  PImage[] bldg7_pre = {loadImage("prev_bldg7.png"),loadImage("prev_bldg7.png"),loadImage("prev_bldg7.png")};
  PImage[] bldg8_pre = {loadImage("prev_bldg8.png"),loadImage("prev_bldg8.png"),loadImage("prev_bldg8.png")};
  cp5 = new ControlP5(this);
  
    //BUILDING BUTTONS----------------------------------------------------------------------------------
  btn1 = cp5.addButton("BLDG1",0,buttonX,buttonY,buttonsizeX,buttonsizeY)
     .setImages(img1)
     .addCallback(c1);
  btn2 = cp5.addButton("BLDG2",1,buttonX,buttonY + 35,buttonsizeX,buttonsizeY)
     .setImages(img2)
     .addCallback(c2);
  btn3 = cp5.addButton("BLDG3",2,buttonX,buttonY + 70,buttonsizeX,buttonsizeY)
     .setImages(img3)
     .addCallback(c3);
  btn4 = cp5.addButton("BLDG4",3,buttonX,buttonY + 105,buttonsizeX,buttonsizeY)
     .setImages(img4)
     .addCallback(c4);
  btn5 = cp5.addButton("BLDG5",4,buttonX,buttonY + 140,buttonsizeX,buttonsizeY)
     .setImages(img5)
     .addCallback(c5);
  btn6 = cp5.addButton("BLDG6",6,buttonX + 85,buttonY,buttonsizeX,buttonsizeY)
     .setImages(img6)
     .addCallback(c6);
  btn7 = cp5.addButton("BLDG7",7,buttonX + 85,buttonY + 35,buttonsizeX,buttonsizeY)
     .setImages(img7)
     .addCallback(c7);
  btn8 = cp5.addButton("BLDG8",8,buttonX + 85,buttonY + 70,buttonsizeX,buttonsizeY)
     .setImages(img8)
     .addCallback(c8);
  btnw = cp5.addButton("WATER",9,buttonX + 85,buttonY + 105,buttonsizeX,buttonsizeY)
    .setImages(img_water)
    .addCallback(cw);
  btnp = cp5.addButton("PARK",5,buttonX + 85,buttonY + 140,buttonsizeX,buttonsizeY)
     .setImages(img_park)
     .addCallback(cp);
  
  //PREVIEW PANE----------------------------------------------------------------------------------
  cp5.addButton("PREVIEW",0,buttonX - 170,buttonY,buttonsizeX,buttonsizeY)
     .setImages(img_preview);
  previewP = cp5.addButton("PREVIEW_P",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(park_pre)
     .setVisible(false);
  previewW = cp5.addButton("PREVIEW_W",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(water_pre)
     .setVisible(false);
  preview1 = cp5.addButton("PREVIEW_1",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg1_pre)
     .setVisible(false);
  preview2 = cp5.addButton("PREVIEW_2",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg2_pre)
     .setVisible(false);
  preview3 = cp5.addButton("PREVIEW_3",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg3_pre)
     .setVisible(false);
  preview4 = cp5.addButton("PREVIEW_4",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg4_pre)
     .setVisible(false);
  preview5 = cp5.addButton("PREVIEW_5",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg5_pre)
     .setVisible(false);
  preview6 = cp5.addButton("PREVIEW_6",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg6_pre)
     .setVisible(false);
  preview7 = cp5.addButton("PREVIEW_7",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg7_pre)
     .setVisible(false);
  preview8 = cp5.addButton("PREVIEW_8",0,buttonX - 166,buttonY + 23,buttonsizeX,buttonsizeY)
     .setImages(bldg8_pre)
     .setVisible(false);
  
  //CAMERA BUTTONS----------------------------------------------------------------------------------
  enableButton = cp5.addButton("Enable_Camera",0,buttonX,buttonY + 200,buttonsizeXL,buttonsizeY)
      .setImages(img_enable);
  disableButton = cp5.addButton("Disable_Camera",0,buttonX,buttonY + 235,buttonsizeXL,buttonsizeY)
      .setImages(img_disable);
  freeButton = cp5.addButton("setFree",0,buttonX, buttonY + 270, buttonsizeX, buttonsizeY)
      .setImages(img_free);
  pitchButton = cp5.addButton("setPitch",0,buttonX + 85, buttonY + 270, buttonsizeX, buttonsizeY)
      .setImages(img_pitch);
  yawButton = cp5.addButton("setYaw",0,buttonX, buttonY + 305, buttonsizeX, buttonsizeY)
      .setImages(img_yaw);
  rollButton = cp5.addButton("setRoll",0,buttonX + 85, buttonY + 305, buttonsizeX, buttonsizeY)
      .setImages(img_roll);
  
  //NAV BUTTONS----------------------------------------------------------------------------------
  cp5.addButton("RIGHT",11,buttonX + 85,buttonY + 450,buttonsizeX,buttonsizeY)
     .setImages(img_right);
  cp5.addButton("LEFT",12,buttonX,buttonY + 450,buttonsizeX,buttonsizeY)
     .setImages(img_left);
  cp5.addButton("UP",12,buttonX + 68,buttonY + 365,buttonsizeY,buttonsizeX)
     .setImages(img_up);
  cp5.addButton("DOWN",12,buttonX + 68,buttonY + 485,buttonsizeY,buttonsizeX)
     .setImages(img_down);
  cp5.addButton("ROTATE",10, buttonX, buttonY + 585, buttonsizeX * 2 + 5,buttonsizeY)
     .setImages(img_rot);
     
    //SAVE/LOAD BUTTONS----------------------------------------------------------------------------------
  cp5.addButton("Load_City",11,buttonX,buttonY + 640,buttonsizeX * 2 + 5,buttonsizeY)
     .setImages(img_load);
  cp5.addButton("Save_City",12,buttonX,buttonY + 675,buttonsizeX * 2 + 5,buttonsizeY)
     .setImages(img_save);
  
//  //POSITION SLIDERS----------------------------------------------------------------------------------
//  cp5.addSlider("ROW")
//     .setPosition(buttonX + 30,350)
//     .setSize(buttonsizeY,90)
//     .setRange(0,4)
//     .setNumberOfTickMarks(5);
//  cp5.addSlider("COL")
//     .setPosition(buttonX + 85,350)
//     .setSize(buttonsizeY,90)
//     .setRange(0,4)
//     .setNumberOfTickMarks(5);
     
  //Turnoff Auto Draw so it can be drawn inthe DrawHUD function
  cp5.setAutoDraw(false);
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--present", "--bgcolor=#666666", "--stop-color=#cccccc", "Final_objcity" });
  }
}
