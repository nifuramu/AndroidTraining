package jp.mixi.assignment.listview.beg.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import jp.mixi.assignment.listview.beg.Book;
import jp.mixi.assignment.listview.beg.R;

import java.util.ArrayList;

public class BookArrayAdapter extends ArrayAdapter<Book> {
	private LayoutInflater mInflater;
	private ArrayList<Book> mList;

    public BookArrayAdapter(Context context, int textViewResourceId, ArrayList<Book> list) {
        super(context, textViewResourceId, list);
        // TODO Auto-generated constructor stub
		this.mList = list;
		this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

	public View getView(int position, View convertView, ViewGroup parent) {
	    View view = convertView;
		if (view == null) {
			view = mInflater.inflate(R.layout.list_item_book, null);
		}
		
		Book book = (Book) mList.get(position);
		TextView title = (TextView) view.findViewById(R.id.Title);
		title.setText(book.getTitle());
		TextView publisher = (TextView) view.findViewById(R.id.Publisher);
		publisher.setText(book.getPublisher());
		TextView price = (TextView) view.findViewById(R.id.Price);
		price.setText(String.valueOf(book.getPrice()));
        return view;
	    
	}
}
