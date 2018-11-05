# Intelliticks

#### Beautiful and customizable Android Activity that shows web pages within an app.

* Builder pattern
* Material design & Pre-made icons
* Webview listeners
* Custom themes & Custom transition animations
* Support collapsing toolbar & contextual actionbar
* SwipeRefreshLayout & Progressbar
* Device rotation
* Gradient divider
* Custom typeface & translation
* Supports Right to Left
## Getting started

#### Gradle Dependency (jcenter)

Easily reference the library in your Android projects using this dependency in your module's `build.gradle` file.

```java
dependencies {
    compile 'com.github.deyrakesh123:Intelliticks:1.0'
}
```

#### Manifest Settings

IntelliTicksWebView is basically and Android activity with webview, toolbar and etc.  
You have to add IntelliTicksWebViewActivity in your `AndroidManifest.xml`

```xml
<uses-permission android:name="android.permission.INTERNET" />

 <activity
            android:name="com.intelliticks.webview.IntelliTicksWebViewActivity"
            android:configChanges="keyboardHidden|orientation|screenSize"
            android:screenOrientation="sensor"
            android:theme="@style/IntelliticksWebViewTheme.Light" />
            
            #### Basic WebView

```java
new IntelliTicksWebView.Builder(this)
                .titleDefault("demo")
                .initilizeKey("pSZJr5kbAY7jEwEtf_c")  //set key
                .action("pricing")  //set action
                .query("")  //set parameter key=value&key=value&key=value
                .toolbarScrollFlags(0)
                .webViewJavaScriptEnabled(true)
                .webViewUseWideViewPort(true)
                .webViewSupportZoom(true)
                .webViewBuiltInZoomControls(true)
                .webViewDisplayZoomControls(false)
                .showSwipeRefreshLayout(false)
                 .loadWeb();
