package com.example.travelfun;

import android.view.*;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.*;
import android.content.Intent;
import android.os.*;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

 
public class HomeDetailActivity extends Activity{

    private ViewPager viewPager;
    private int[] images;  
    private ImageButton backBtn;
    private TextView page;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        backBtn=(ImageButton)findViewById(R.id.backBtn);
        
        backBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeDetailActivity.this,HomeActivity.class);
				startActivity(intent);
			}
			
		});

        //初始化图片资源
        images=new int[]{R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4,R.drawable.item5};
        
        //初始化页码
        page = (TextView)findViewById(R.id.page);
        page.setText(1+"/"+images.length);

        //-----初始化PagerAdapter------
        PagerAdapter adapter=new PagerAdapter(){

            @Override
            public int getCount() {          	
                return images.length;
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                return arg0==arg1;
            }

            @Override
            public void destroyItem(ViewGroup container,int position,Object o){

            }
           
            @Override
            public Object instantiateItem(ViewGroup container,int position){
            	
                ImageView im=new ImageView(HomeDetailActivity.this);            
                im.setImageResource(images[position]);
                container.addView(im);
                return im;

            }

        };

        viewPager.setAdapter(adapter);      
        viewPager.setOnPageChangeListener(new GuidePageChangeListener());
   
    }
    
    //ViewPager的onPageChangeListener监听事件，当ViewPager的page页发生变化的时候调用
    public class GuidePageChangeListener implements ViewPager.OnPageChangeListener {
    	private TextView page;
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
        //页面滑动完成后执行
        @Override
        public void onPageSelected(int position) {
        	page = (TextView)findViewById(R.id.page);
            page.setText((position+1)+"/"+images.length);
        }
        //监听页面的状态，0--静止 1--滑动  2--滑动完成
        @Override
        public void onPageScrollStateChanged(int state) {
        }
      
    }

}