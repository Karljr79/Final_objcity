void Enable_Camera()
{
  cam.setActive(true);
  disableButton.setSwitch(false);
  enableButton.setSwitch(true);
}

void Load_City()
{
  String loadpath = selectInput("Get Me a City File......");
  String[] cityfile = loadStrings(loadpath);
  int count = 0;
  int t;
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
        t = int(cityfile[count]);
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

void Save_City()
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

void Disable_Camera()
{
  cam.setActive(false);
  disableButton.setSwitch(true);
  enableButton.setSwitch(false);
}

void setYaw()
{
  cam.setYawRotationMode();
  yawButton.setSwitch(true);
  pitchButton.setSwitch(false);
  rollButton.setSwitch(false);
  freeButton.setSwitch(false);
  
}

void setPitch()
{
  cam.setPitchRotationMode();
  pitchButton.setSwitch(true);
  rollButton.setSwitch(false);
  freeButton.setSwitch(false);
  yawButton.setSwitch(false);
}

void setRoll()
{
  cam.setRollRotationMode();
  yawButton.setSwitch(false);
  pitchButton.setSwitch(false);
  rollButton.setSwitch(true);
  freeButton.setSwitch(false);
}

void setFree()
{
  cam.setFreeRotationMode();
  yawButton.setSwitch(false);
  pitchButton.setSwitch(false);
  rollButton.setSwitch(false);
  freeButton.setSwitch(true);
}

void BLDG1()
{
  pos[COL][ROW].setModel("bldg1.obj");
  pos[COL][ROW].setData("1");
}

void BLDG2()
{
  pos[COL][ROW].setModel("bldg2.obj");
  pos[COL][ROW].setData("2");
}

void BLDG3()
{
  pos[COL][ROW].setModel("bldg3.obj");
  pos[COL][ROW].setData("3");
}

void BLDG4()
{
  pos[COL][ROW].setModel("bldg4.obj");
  pos[COL][ROW].setData("4");
}

void BLDG5()
{
  pos[COL][ROW].setModel("bldg5.obj");
  pos[COL][ROW].setData("5");
}

void BLDG6()
{
  pos[COL][ROW].setModel("bldg6.obj");
  pos[COL][ROW].setData("6");
}

void BLDG7()
{
  pos[COL][ROW].setModel("bldg7.obj");
  pos[COL][ROW].setData("7");
}

void BLDG8()
{
  pos[COL][ROW].setModel("bldg8.obj");
  pos[COL][ROW].setData("8");
}

void PARK()
{
  pos[COL][ROW].setModel("bldg_park.obj");
  pos[COL][ROW].setData("10");
}

void WATER()
{
  pos[COL][ROW].setModel("bldg_water.obj");
  pos[COL][ROW].setData("9");
}

void RIGHT()
{
  if (COL == numCols - 1)
    COL = 0;
  else 
    COL++;
}

void LEFT()
{
  if (COL == 0)
    COL = numCols - 1;
  else 
    COL--;
}

void DOWN()
{
  if (ROW == numRows - 1)
    ROW = 0;
  else 
    ROW++;
}

void UP()
{
  if (ROW == 0)
    ROW = numRows - 1;
  else
    ROW--;
}

void ROTATE()
{
  pos[COL][ROW].setRot(radians(90.00));
}
