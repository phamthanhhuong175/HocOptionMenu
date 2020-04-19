package phamthanhhuong.com.hocoptionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId())
       {
           case R.id.mnuHuongDan:
               Intent intent=new Intent(MainActivity.this, HuongDanActivity.class);
               startActivity(intent);
               break;
           case R.id.mnuGioiThieu:
               Intent intent1 =new Intent(MainActivity.this,GioiThieuActivity.class);
               startActivity(intent1);
               break;
       }
        return super.onOptionsItemSelected(item);
    }
}
