# Creating the Screenlet Class

The Screenlet class is the main component that governs the Screenlet's behavior. 
When using a Screenlet, app developers primarily interact with its Screenlet 
class. A list Screenlet's Screenlet class must extend the 
[`BaseListScreenlet` class](https://github.com/liferay/liferay-screens/blob/master/ios/Framework/Core/Base/BaseListScreenlet/BaseListScreenlet.swift) 
and define the configurable `IBInspectable` properties the Screenlet needs. The 
Screenlet class must also create and return an instance of your Interactor, and 
respond to the Screenlet's events via the delegate. 
