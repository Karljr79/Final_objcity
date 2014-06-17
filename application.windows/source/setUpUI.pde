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
