package gfx;

import java.awt.image.BufferedImage;

public class Asset {
	
	public static final int width = 80, height = 80;
	
	public static BufferedImage player_icon_1, backgroung, 
	i100, i99, i98, i97, i96, i95, i94, i93, i92, i91, 
	i81, i82, i83, i84, i85, i86, i87, i88, i89, i90, 
	i80, i79, i78, i77, i76, i75, i74, i73, i72, i71, 
	i61, i62, i63, i64, i65, i66, i67, i68, i69, i70, 
	i60, i59, i58, i57, i56, i55, i54, i53, i52, i51, 
	i41, i42, i43, i44, i45, i46, i47, i48, i49, i50, 
	i40, i39, i38, i37, i36, i35, i34, i33, i32, i31, 
	i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, 
	i20, i19, i18, i17, i16, i15, i14, i13, i12, i11, 
	i1, i2, i3, i4, i5, i6, i7,  i8, i9, i10;
	
	public static void init() {
		
		backgroung = ImageLoader.loadImage("/textures/backgroung_1.png");
		
		SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/sheet_icon_1.png"));
		
		i100 = sheet1.crop(width-width, height-height, width, height);
		i99 = sheet1.crop(width, height-height, width, height);
		i98 = sheet1.crop(width*2, height-height, width, height);
		i97 = sheet1.crop(width*3, height-height, width, height);
		i96 = sheet1.crop(width*4, height-height, width, height);
		i95 = sheet1.crop(width*5, height-height, width, height);
		i94 = sheet1.crop(width*6, height-height, width, height);
		i93 = sheet1.crop(width*7, height-height, width, height);
		i92 = sheet1.crop(width*8, height-height, width, height);
		i91 = sheet1.crop(width*9, height-height, width, height);
		
		i81 = sheet1.crop(width-width, height, width, height);
		i82 = sheet1.crop(width, height, width, height);
		i83 = sheet1.crop(width*2, height, width, height);
		i84 = sheet1.crop(width*3, height, width, height);
		i85 = sheet1.crop(width*4, height, width, height);
		i86 = sheet1.crop(width*5, height, width, height);
		i87 = sheet1.crop(width*6, height, width, height);
		i88 = sheet1.crop(width*7, height, width, height);
		i89 = sheet1.crop(width*8, height, width, height);
		i90 = sheet1.crop(width*9, height, width, height);
		
		i80 = sheet1.crop(width-width, height*2, width, height);
		i79 = sheet1.crop(width, height*2, width, height);
		i78 = sheet1.crop(width*2, height*2, width, height);
		i77 = sheet1.crop(width*3, height*2, width, height);
		i76 = sheet1.crop(width*4, height*2, width, height);
		i75 = sheet1.crop(width*5, height*2, width, height);
		i74 = sheet1.crop(width*6, height*2, width, height);
		i73 = sheet1.crop(width*7, height*2, width, height);
		i72 = sheet1.crop(width*8, height*2, width, height);
		i71 = sheet1.crop(width*9, height*2, width, height);
		
		i61 = sheet1.crop(width-width, height*3, width, height);
		i62 = sheet1.crop(width, height*3, width, height);
		i63 = sheet1.crop(width*2, height*3, width, height);
		i64 = sheet1.crop(width*3, height*3, width, height);
		i65 = sheet1.crop(width*4, height*3, width, height);
		i66 = sheet1.crop(width*5, height*3, width, height);
		i67 = sheet1.crop(width*6, height*3, width, height);
		i68 = sheet1.crop(width*7, height*3, width, height);
		i69 = sheet1.crop(width*8, height*3, width, height);
		i70 = sheet1.crop(width*9, height*3, width, height);
		
		i60 = sheet1.crop(width-width, height*4, width, height);
		i59 = sheet1.crop(width, height*4, width, height);
		i58 = sheet1.crop(width*2, height*4, width, height);
		i57 = sheet1.crop(width*3, height*4, width, height);
		i56 = sheet1.crop(width*4, height*4, width, height);
		i55 = sheet1.crop(width*5, height*4, width, height);
		i54 = sheet1.crop(width*6, height*4, width, height);
		i53 = sheet1.crop(width*7, height*4, width, height);
		i52 = sheet1.crop(width*8, height*4, width, height);
		i51 = sheet1.crop(width*9, height*4, width, height);
		
		i41 = sheet1.crop(width-width, height*5, width, height);
		i42 = sheet1.crop(width, height*5, width, height);
		i43 = sheet1.crop(width*2, height*5, width, height);
		i44 = sheet1.crop(width*3, height*5, width, height);
		i45 = sheet1.crop(width*4, height*5, width, height);
		i46 = sheet1.crop(width*5, height*5, width, height);
		i47 = sheet1.crop(width*6, height*5, width, height);
		i48 = sheet1.crop(width*7, height*5, width, height);
		i49 = sheet1.crop(width*8, height*5, width, height);
		i50 = sheet1.crop(width*9, height*5, width, height);
		
		i40 = sheet1.crop(width-width, height*6, width, height);
		i39 = sheet1.crop(width, height*6, width, height);
		i38 = sheet1.crop(width*2, height*6, width, height);
		i37 = sheet1.crop(width*3, height*6, width, height);
		i36 = sheet1.crop(width*4, height*6, width, height);
		i35 = sheet1.crop(width*5, height*6, width, height);
		i34 = sheet1.crop(width*6, height*6, width, height);
		i33 = sheet1.crop(width*7, height*6, width, height);
		i32 = sheet1.crop(width*8, height*6, width, height);
		i31 = sheet1.crop(width*9, height*6, width, height);
		
		i21 = sheet1.crop(width-width, height*7, width, height);
		i22 = sheet1.crop(width, height*7, width, height);
		i23 = sheet1.crop(width*2, height*7, width, height);
		i24 = sheet1.crop(width*3, height*7, width, height);
		i25 = sheet1.crop(width*4, height*7, width, height);
		i26 = sheet1.crop(width*5, height*7, width, height);
		i27 = sheet1.crop(width*6, height*7, width, height);
		i28 = sheet1.crop(width*7, height*7, width, height);
		i29 = sheet1.crop(width*8, height*7, width, height);
		i30 = sheet1.crop(width*9, height*7, width, height);
		
		i20 = sheet1.crop(width-width, height*8, width, height);
		i19 = sheet1.crop(width, height*8, width, height);
		i18 = sheet1.crop(width*2, height*8, width, height);
		i17 = sheet1.crop(width*3, height*8, width, height);
		i16 = sheet1.crop(width*4, height*8, width, height);
		i15 = sheet1.crop(width*5, height*8, width, height);
		i14 = sheet1.crop(width*6, height*8, width, height);
		i13 = sheet1.crop(width*7, height*8, width, height);
		i12 = sheet1.crop(width*8, height*8, width, height);
		i11 = sheet1.crop(width*9, height*8, width, height);
		
		i1 = sheet1.crop(width-width, height*9, width, height);
		i2 = sheet1.crop(width, height*9, width, height);
		i3 = sheet1.crop(width*2, height*9, width, height);
		i4 = sheet1.crop(width*3, height*9, width, height);
		i5 = sheet1.crop(width*4, height*9, width, height);
		i6 = sheet1.crop(width*5, height*9, width, height);
		i7 = sheet1.crop(width*6, height*9, width, height);
		i8 = sheet1.crop(width*7, height*9, width, height);
		i9 = sheet1.crop(width*8, height*9, width, height);
		i10 = sheet1.crop(width*9, height*9, width, height);
		
		player_icon_1 = ImageLoader.loadImage("/textures/player_icon_1.png");
	}
}
