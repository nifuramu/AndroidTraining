
package jp.mixi.practice.listview.beg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private Activity mActivity;
    private ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;

        // ListViewに表示するデータを作成する
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add("hoge" + i);
        }

        mList = (ListView) findViewById(R.id.ListView);
        // android.R.layout.simple_list_item_1はAndroidで既に定義されているリストアイテムのレイアウトです
        CustomListItemAdapter adapter = new CustomListItemAdapter(mActivity,
                list);

        mList.setAdapter(adapter);
        // タップした時の動作を定義する
        mList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Adapterからタップした位置のデータを取得する
                String str = (String) parent.getItemAtPosition(position);
                Toast.makeText(mActivity, str, Toast.LENGTH_SHORT).show();
            }
        });
        
        Button button = (Button)findViewById(R.id.Scroll2Top);
        button.setOnClickListener(new ScrollToTopButtonClickListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	private class ScrollToTopButtonClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
		    if (mList == null) {
		        mList = (ListView) findViewById(R.id.ListView);
		    }
		    mList.smoothScrollToPosition(0);
		}
		
	}
}
