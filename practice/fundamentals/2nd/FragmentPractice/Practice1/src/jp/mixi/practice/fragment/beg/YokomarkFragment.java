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
		// LayoutInflater �𗘗p���āA���C�A�E�g�����\�[�X�Ƃ��ēǂݍ���
		View view = inflater.inflate(R.layout.fragment_yokomark, container, false);
		return view;
	}

	// ��������p�̃��\�b�h�BFragment �ɑ΂��鏉�����p�̈����͂����ŊǗ�����
	public static YokomarkFragment createInstance() {
		YokomarkFragment fragment = new YokomarkFragment();
		return fragment;
	}

}
