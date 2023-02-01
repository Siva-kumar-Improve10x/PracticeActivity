package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Checkbox_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        orderSuccessFull();
    }

    private  void orderSuccessFull (){
        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
            CheckBox pizzaBtn = findViewById(R.id.pizza_btn);
            CheckBox coffeeBtn = findViewById(R.id.cpffee_btn);
            CheckBox burgerBtn = findViewById(R.id.buger_btn);
            boolean isPizzaChecked = pizzaBtn.isChecked();
            boolean isCoffeeChecked = coffeeBtn.isChecked();
            boolean isBurgerChecked = burgerBtn.isChecked();
            String orderDetails = placeOrder(isBurgerChecked,isCoffeeChecked,isPizzaChecked);
            Toast.makeText(this, orderDetails, Toast.LENGTH_LONG).show();
        });

    }

    private String placeOrder(boolean isBurgerChecked, boolean isCoffeeChecked, boolean isPizzaChecked) {
        int totalAmount = 0;
        String result = "Selected Items :";
        if (isPizzaChecked){
            totalAmount += 100;
            result += " Pizza Rs.100 ";
        }
        if (isBurgerChecked){
            totalAmount += 100;
            result += " Burger Rs.50 ";
        }
        if (isCoffeeChecked){
            totalAmount += 20;
            result += " Coffee Rs.20 ";
        }
        result += " Total Amount : " + totalAmount;
        return result;
    }
}






