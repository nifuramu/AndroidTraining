
package jp.mixi.assignment.listview.beg;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BookActivity extends Activity {

    @SuppressWarnings("unused")
    private static final String TAG = BookActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_book);

        // TODO:MainActiviyから送られてきたtitleを表示してください。
        String title = (String) getIntent().getStringExtra("title");
        TextView bookTitle = (TextView) findViewById(R.id.BookTitle);
        if (bookTitle != null) {
            bookTitle.setText(title.toString());
        }
    }
}
