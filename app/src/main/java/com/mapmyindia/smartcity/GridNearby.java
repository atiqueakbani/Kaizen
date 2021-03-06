package com.mapmyindia.smartcity;

/**
 * Created by Faisal on 15-Oct-16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridNearby extends Activity {
    GridView grid;
    int[] imageId = {
            R.drawable.firebrigade,
            R.drawable.hospital,
            R.drawable.police,
            R.drawable.atm_icon,
            R.drawable.public_toilets,
            R.drawable.restaurant,
            R.drawable.bus_stop,
            R.drawable.cargo,
            R.drawable.metro
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_nearby);

        CustomGridNearby adapter = new CustomGridNearby(GridNearby.this,  imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent;
                //   Toast.makeText(MainActivity.this, "You Clicked at " , Toast.LENGTH_SHORT).show();
                switch(position) {
                    case 0:
                        Log.d("Grid", "Clicked on first");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "firestation");
                        startActivity(intent);
                        break;
                    case 1:
                        Log.d("Grid", "Clicked on second");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "hospital");
                        startActivity(intent);
                        break;
                    case 2:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "police");
                        startActivity(intent);
                        break;
                    case 3:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "atm");
                        startActivity(intent);
                        break;
                    case 4:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "toilets");
                        startActivity(intent);
                        break;
                    case 5:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "restaurants");
                        startActivity(intent);
                        break;
                    case 6:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "bus");
                        startActivity(intent);
                        break;
                    case 7:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "cargo");
                        startActivity(intent);
                        break;
                    case 8:
                        Log.d("Grid", "Clicked on third!");
                        intent = new Intent(GridNearby.this , MapActivity.class);
                        intent.putExtra("Place", "metro");
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
