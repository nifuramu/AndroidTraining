Assignment Report for 2.2
------

以下に、課題の回答を記入してください。

Activity と Fragment
======

### Activity

3. ライフサイクルのコールバックメソッドの呼び出し順

起動したら

# onCreate
# onStart

の順にコールバックされた

起動後にほっといたら
# onResume

がコールバックされた

homeボタンを押したら
# onPause
# onStop

の順にコールバックされた

アプリを再度起動したら
# onRestart
# onStart

の順にコールバックされた

backボタンを押したら
# onPause
# onStop
# onDestroy

の順にコールバックされた

