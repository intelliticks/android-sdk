# Intelliticks

## Getting started

#### Gradle Dependency (jcenter)

Add the repository below in your Project's `build.gradle` in the repositories section. After adding it will look like
```java
allprojects {
    repositories {
        maven {
            url 'https://jitpack.io'
        }
    }
}
```
And reference the library using this dependency in your module's `build.gradle` file.

```java
dependencies {
    compile 'com.github.intelliticks:android-sdk:0.4'
}
```

#### Manifest Settings

IntelliTicksWebView is basically and Android activity.  
You have to add IntelliTicksWebViewActivity in your `AndroidManifest.xml` along with permission to use internet.

```xml
<uses-permission android:name="android.permission.INTERNET" />

 <activity
            android:name="com.intelliticks.webview.IntelliTicksWebViewActivity"
            android:configChanges="keyboardHidden|orientation|screenSize"
            android:screenOrientation="sensor"
            android:theme="@style/IntelliticksWebViewTheme.Light" />
            
            #### Basic WebView
```

Use the sample code below to open the activity

```java
new IntelliTicksWebView.Builder(this)
                .titleDefault("Talk to us")//title of topbar
                .initilizeKey("<your account key>")//Please contact us for account key
                .action("help")//Contact us to know the action for your app.
                .toolbarScrollFlags(0)
                .webViewJavaScriptEnabled(true)
                .webViewUseWideViewPort(true)
                .webViewSupportZoom(true)
                .webViewBuiltInZoomControls(true)
                .webViewDisplayZoomControls(false)
                .showSwipeRefreshLayout(false)
                .toolbarColor(getResources().getColor(R.color.Color_Red))//color of topbar
                .titleColor(getResources().getColor(R.color.Color_White))//color of title
                .loadWeb();
