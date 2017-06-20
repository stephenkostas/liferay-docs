# Installing Liferay Screens and the Guestbook Mobile SDK

For your iOS app to work with the Guestbook portlet, you must install the 
following in your iOS project: 

- **Liferay's pre-built Mobile SDK:** This Mobile SDK contains the classes that 
  call Liferay Portal's core remote services. It also contains the framework
  necessary for any Mobile SDK to make server calls. 

- **The Guestbook Mobile SDK:** This Mobile SDK contains only the classes that 
  call the Guestbook portlet's remote services. 

- **Liferay Screens:** Screens contains the Screenlet framework and 
  [several built-in Screenlets](/develop/reference/-/knowledge_base/6-2/screenlets-in-liferay-screens-for-ios) 
  like Login Screenlet. Because these built-in Screenlets work with Liferay 
  Portal's core apps, they make their server calls with Liferay's pre-built
  Mobile SDK. Note that all Screenlets, including those that make server calls
  with a custom-built Mobile SDK, must use the framework in Liferay's pre-built
  Mobile SDK to issue their calls. 

Since Liferay's pre-built Mobile SDK is a dependency of Liferay Screens, 
installing Screens automatically installs this Mobile SDK. You must, however, 
install the Guestbook Mobile SDK manually. 

This article walks you through the installation of the Guestbook Mobile SDK and 
Liferay Screens. When you finish, you'll be ready to start developing the app. 

## Installing Liferay Screens

You'll use 
[CocoaPods](https://cocoapods.org/) 
to install Liferay Screens. 
[Click here](https://guides.cocoapods.org/using/getting-started.html) 
for instructions on installing CocoaPods. After installing CocoaPods, use these 
steps to install Screens: 

1.  In your project's root folder, create a file named `Podfile` that contains 
    the following: 

        source 'https://github.com/CocoaPods/Specs.git'

        platform :ios, '8.0'
        use_frameworks!

        target "Liferay Guestbook" do
            pod 'LiferayScreens', '2.1.2'
        end

        post_install do |installer|
            installer.pods_project.targets.each do |target|
                target.build_configurations.each do |config|
                    config.build_settings['CONFIGURATION_BUILD_DIR'] = '$PODS_CONFIGURATION_BUILD_DIR'
                end
            end
        end

2.  On the terminal, navigate to your project's root folder and run this 
    command: 

        pod repo update

    This ensures you have the latest version of the CocoaPods repository on your 
    machine. Note that this command can take a while to run. 

3.  Still in your project's root folder in the terminal, run this command: 

        pod install

    Once this completes, quit Xcode and reopen your project by using the 
    `LiferayGuestbook.xcworkspace` file in your project's directory. From now 
    on, you must use this file to open your project. 

Great! You just installed Liferay Screens and the Liferay Mobile SDK! Next, 
you'll install the Guestbook Mobile SDK. 

## Installing the Guestbook Mobile SDK

To install the Guestbook Mobile SDK, you must add its service classes to your 
project. Recall that these service classes are Objective-C. 
[To use them from your project's Swift code](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/BuildingCocoaApps/MixandMatch.html), 
you must also add and configure an Objective-C bridging header. This section 
walks you through both of these steps. 

Recall that you created the following ZIP file for the Guestbook Mobile SDK: 

    modules/guestbook-portlet/build/liferay-guestbook-portlet-ios-sdk-1.0.zip

Unzip this file to a location of your choosing on your machine. This creates the 
following directory hierarchy: 

![Figure 1: The Guestbook Mobile SDK's Objective-C classes unzip to this folder structure.](../../../images/ios-lp-sdk-structure.png)

This should look familiar. It's the same `Service` folder, contents and all, 
from the Guestbook Mobile SDK you built in the previous article. To install the 
service classes in your project, drag the `v62` folder from your Finder into 
your Xcode project, directly under the top-level Liferay Guestbook project. In 
the dialog that appears, make sure you select the following items, and then 
click *Finish*: 

![Figure 2: When adding the Guestbook Mobile SDK to your project, select these options and then click *Finish*.](../../../images/ios-lp-add-sdk.png)

![Figure 3: Your project structure should look like this after adding the Guestbook SDK.](../../../images/ios-lp-post-sdk-install.png)

