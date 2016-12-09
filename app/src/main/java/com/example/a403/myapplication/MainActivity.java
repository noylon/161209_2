package com.example.a403.myapplication;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.RadioButton;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_pizza_val, et_spagetti_val, et_salad_val;
    CheckBox cb_membership;
    RadioButton rb_pickle, rb_sauce;
    ImageView iv_option;
    Button bt_order;
    TextView tv_order_val, tv_order_cost, tv_order_option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_pizza_val = (EditText)findViewById(R.id.pizza_val);
        et_salad_val = (EditText)findViewById(R.id.salad_val);
        et_spagetti_val = (EditText)findViewById(R.id.spagetti_val);
        cb_membership = (CheckBox)findViewById(R.id.membership);
        rb_pickle = (RadioButton)findViewById(R.id.pickle);
        rb_sauce = (RadioButton)findViewById(R.id.sauce);
        iv_option = (ImageView)findViewById(R.id.imageView1);
        bt_order = (Button)findViewById(R.id.order);
        tv_order_val = (TextView)findViewById(R.id.order_val);
        tv_order_cost =(TextView)findViewById(R.id.order_cost);
        tv_order_option=(TextView)findViewById(R.id.order_option);

        bt_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order();
            }
        });

    }


    void order(){
        double valuesum;
        double cost;
        double a = Double.parseDouble(et_pizza_val.getText().toString());
        double b = Double.parseDouble(et_spagetti_val.getText().toString());
        double c = Double.parseDouble(et_salad_val.getText().toString());
        valuesum = a+b+c;
        cost = (a*16000)+(b*11000)+(c*4000);
        if(cb_membership.isChecked()== true){
            cost = ((a*16000)+(b*11000)+(c*4000))*0.93;
        }
        tv_order_val.setText("총명수: "+valuesum);
        tv_order_cost.setText("결제 금액: "+cost);

    }
}