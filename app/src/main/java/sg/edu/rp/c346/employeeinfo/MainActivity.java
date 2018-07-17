package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvinfo;
    ArrayList<InfoItem> alinfoitem;
    CustomAdapter cainfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvinfo=findViewById(R.id.ListViewInfo);
        alinfoitem=new ArrayList<>();
        InfoItem item1 = new InfoItem("John","Software Technical Leader",3400.0f);
        InfoItem item2 = new InfoItem("May","Programmer",2200.0f);


        alinfoitem.add(item1);
        alinfoitem.add(item2);

        cainfo= new CustomAdapter(this,R.layout.employee, alinfoitem);
        lvinfo.setAdapter(cainfo);
    }
}
