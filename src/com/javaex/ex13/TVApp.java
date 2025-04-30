package com.javaex.ex13;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
        
        tv.status();
        
        tv.setPower( true );
        tv.setVolume( 120 );  //100으로 유지
        tv.status();
        
        tv.setVolume( false );
        tv.status();
        
        tv.setChannel( 0 );
        tv.status();
        
        tv.setChannel( true );
        tv.setChannel( true );
        tv.setChannel( true );
        tv.status();
        
        tv.setPower( false );
        tv.status();
    }
}
