package com.example.finaldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.progressindicator.DeterminateDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton onemg , ajio , aliex , amezon ,bangw, bms,clubf,dominos,firstcry , makemytrip,flipkart,freecharge,goibibo,lenskart,mac;
        ImageButton mobikwik ,myntra,netmeds,pvr,twitter,tata,twogud,insta ,cricbuzz,yahoo,youtube, bbc,zomato,nayka,paytmm,pizzahat,paytm,shopclus,snapdeal,swiggy;
        onemg=findViewById(R.id.onemg);
        ajio=findViewById(R.id.ajio);
        aliex=findViewById(R.id.aliex);
        amezon=findViewById(R.id.amezon);
        bangw=findViewById(R.id.bangw);
        bms=findViewById(R.id.bms);
        clubf=findViewById(R.id.clubf);
        dominos=findViewById(R.id.dominos);
        firstcry=findViewById(R.id.firstcry);
        flipkart=findViewById(R.id.flipkart);
        freecharge=findViewById(R.id.freecharge);
        goibibo=findViewById(R.id.goibibo);
        lenskart=findViewById(R.id.lenskart);
        mac=findViewById(R.id.mac);
        makemytrip=findViewById(R.id.makemytrip);
        mobikwik=findViewById(R.id.mobikwik);
        myntra=findViewById(R.id.myntra);
        netmeds=findViewById(R.id.netmeds );
        nayka=findViewById(R.id.nayka);
        paytmm=findViewById(R.id.paytmm);
        pizzahat=findViewById(R.id.pizzahat);
        paytm=findViewById(R.id.paytm);
        shopclus=findViewById(R.id.shopclus);
        pvr=findViewById(R.id.pvr);
        snapdeal=findViewById(R.id.snapdeal);
        swiggy=findViewById(R.id.swiggy);
        tata=findViewById(R.id.tata);
        twogud=findViewById(R.id.twogud);
        zomato=findViewById(R.id.zomato);
        insta=findViewById(R.id.insta);
        youtube=findViewById(R.id.youtube);
        twitter=findViewById(R.id.twitter);
        yahoo=findViewById(R.id.yahoo);
        bbc=findViewById(R.id.bbc);
        cricbuzz=findViewById(R.id.cricbuzz);
        onemg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, onemg.class);
                startActivity(send);
            }
        });
        ajio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, ajio.class);
                startActivity(send);
            }
        });
        aliex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, aliex.class);
                startActivity(send);

            }
        });
        amezon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, amezon.class);
                startActivity(send);

            }
        });
        bangw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, bangw.class);
                startActivity(send);
            }
        });
        bms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, bms.class);
                startActivity(send);
            }
        });
        clubf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, clubf.class);
                startActivity(send);
            }
        });
        dominos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, dominos.class);
                startActivity(send);
            }
        });
        firstcry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, firstcry.class);
                startActivity(send);
            }
        });
        flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, flipkart.class);
                startActivity(send);
            }
        });
        freecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, freecharge.class);
                startActivity(send);
            }
        });
        goibibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, goibibo.class);
                startActivity(send);
            }
        });
        lenskart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, lenskart.class);
                startActivity(send);

            }
        });
        mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, mac.class);
                startActivity(send);
            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, makemytrip.class);
                startActivity(send);

            }
        });
        mobikwik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, mobikwik.class);
                startActivity(send);
            }
        });
        myntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, myntra.class);
                startActivity(send);
            }
        });
        netmeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, netmeds.class);
                startActivity(send);
            }
        });
        nayka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, nayka.class);
                startActivity(send);
            }
        });
        paytmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,paytmm.class);
                startActivity(send);
            }
        });
        pizzahat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,pizzahat.class);
                startActivity(send);
            }
        });
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,paytm.class);
                startActivity(send);
            }
        });
        shopclus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send=new Intent(MainActivity.this,shopclus.class);
                startActivity(send);
            }
        });
        pvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,pvr.class);
                startActivity(send);
            }
        });
        snapdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,snapdeal.class);
                startActivity(send);
            }
        });
        swiggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,swiggy.class);
                startActivity(send);
            }
        });
        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send= new Intent(MainActivity.this,tata.class);
                startActivity(send);
            }
        });
        twogud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send= new Intent(MainActivity.this,twogud.class);
                startActivity(send);
            }
        });
        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send=new Intent(MainActivity.this,zomato.class);
                startActivity(send);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send= new Intent(MainActivity.this,insta.class);
                startActivity(send);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,youtube.class);
                startActivity(send);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,twitter.class) ;
                startActivity(send);
            }
        });
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,yahoo.class);
                startActivity(send);
            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,bbc.class);
                startActivity(send);
            }
        });
        cricbuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this,cricbuzz.class);
                startActivity(send);
            }
        });
    }
}