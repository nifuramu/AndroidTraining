package jp.mixi.practice.fragment.beg;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class YokomarkFragment extends Fragment {
	public YokomarkFragment() {
	}   
	
	@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// LayoutInflater を利用して、レイアウトをリソースとして読み込む
		View view = inflater.inflate(R.layout.fragment_yokomark, container, false);
		return view;
	}

	// 初期化専用のメソッド。Fragment に対する初期化用の引数はここで管理する
	public static YokomarkFragment createInstance() {
		YokomarkFragment fragment = new YokomarkFragment();
		return fragment;
	}

}
