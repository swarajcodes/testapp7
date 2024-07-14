TOPICS COVERED :- KOTLIN BASIC SYNTAX 
		  CONTROL STATEMENTS
		  LOOPS
		  COLLECTION FRAMEWORK
		  CLASS AND FUNCTION
		  LAMBDA
		  EXCEPTION HANDLING
		  COROUTINES

Main Thread - executable

//note//
any changes to UI should happen on the main thread only
//

Jetpack Compose(Framework)

//history//- UI    -> XML
             logic -> java
             
             * we have to map each UI component to a part of logic
               coupling(dependency of UI module on logic module grows high)
             -> low coupling desirable
                as less dependent modules , minimal changes required leading to flexible code.

             cohesion - functional strength on individual module


low coupling , high cohesion required

Declarative Framework Jetpack Compose:- Same language (kotlin functions/composable function)
                                        it has all the UI elements.

advantages - simplified UI development
             
xml was Imperative
this is declarative i.e. describe how the UI looks like in a given state

//apple removed storyboard to use swift UI//
//android removed xml to use Jetpack compose//

*Existing Application can be migrated to Jetpack Compose.

Android Manifest files stores the meta data
                 user permissions

build.gradle compile sdk
             min sdk required
             current application level

             application id- com.swaraj.testapp7

             dependencies- all imported libraries

MainActivity.kt entry point to executed app
                onCreate to check authentication and proceed to page required
                

App lifecycle
maintained by mainActivity

i.e when was it created -> start -> pause -> resume -> stop -> destroy

methods:- onCreate() - when first time launch
          onStart()  - when activity/view is visible to user
          onPause()  - when view is ready to go to background(system is about to put this app into background)
          onResume() - when view interacts with user
          onStop()   - when activity/view is not visible to the user
          onDestroy()- app is destroyed

diagram - https://images.app.goo.gl/upyUdbJLe4X6mNUF9

medium article - https://medium.com/@mohammadjoumani/life-cycle-in-jetpack-compose-2e96136ab936


setContent() - decides actual content to the activity/view

enableedgetoedge ignores safe area



Today's Assignment
- Read Docs about History of Jetpack Compose.
- Implement App lifecycles methods and prepare a note on it.
- Build Your application on both emulator and physical device. Implement all the modifiers of Text. Push your codes to git and include screenshots

try out this and add screenshots to readme file.
https://developer.android.com/develop/ui/compose/text/style-text
