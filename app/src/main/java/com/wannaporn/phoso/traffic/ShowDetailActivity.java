package com.wannaporn.phoso.traffic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    private TextView showTitleTextView;
    private TextView showDetailTextView;
    private ImageView showTrafficImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        bindWidget();
        showWidget();
    }
    private void bindWidget() {
        showTitleTextView=(TextView)findViewById(R.id.textTitleDetail);
        showDetailTextView=(TextView)findViewById(R.id.textDetail);
        showTrafficImageView=(ImageView)findViewById(R.id.imvTrafficDetail);
    }
    private void showWidget() {
        int intClick =getIntent().getIntExtra("click",0);

        Mydata objMydata =new Mydata();
        String[] strTitle=objMydata.title();
        showTitleTextView.setText(strTitle[intClick]);

        int[] intDrawable = objMydata.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);

        String[] strDetail=getResources().getStringArray(R.array.traffic_detail);
        showDetailTextView.setText(strDetail[intClick]);
    }
}
