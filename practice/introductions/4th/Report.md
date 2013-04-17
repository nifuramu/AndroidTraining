Practice Report for 1.4
------

実習のレポートを下記に記述してください

1. (実習)Android SDK 内の、下記の 2 つのディレクトリにあるコマンドを列挙してください。
2. (実習)上記のディレクトリにパスを通し、下記のコマンドを実行してください。
3. (実習)adb shellコマンドを使って、Android 内のファイルシステムにアクセスし、下記の項目を確認してください。

* sdk/tools
  * android
  * apkbuilder
  * ddms
  * dmtracedump
  * draw9patch
  * emulator
  * emulator-arm
  * emulator-mips
  * emulator-x86
  * emulator64-arm
  * emulator64-mips
  * emulator64-x86
  * etc1tool
  * hierarchyviewer
  * hprof-conv
  * jobb
  * lint
  * mksdcard
  * monitor
  * monkeyrunner
  * sqlite3
  * traceview
  * uiautomatorviewer
  * zipalign

* sdk/platform-tools
  * aapt
  * adb
  * aidl
  * dexdump
  * dx
  * fastboot
  * llvm-rs-cc

```
$ adb devices
List of devices attached 
CB511WFK9G  device
```

```
$ adb shell
shell@android:/ $ 
```

```
shell@android:/ $ ls /data/data                                                
opendir failed, Permission denied
```

```
shell@android:/ $ ls /sdcard/Android/data/                                   
hogehoge...
```
