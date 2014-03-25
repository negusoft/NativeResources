NativeResources
===============

Android utility to access native resources.


Disclaimer
==========

This library is actually a hack. The native resources are not meant to be accessed so it is not adviced to use this method in most cases.

If you are sure that you want to access native resources, take into account that a given resource might be present in an Android version but not in others. So make sure your code is prepared for a given value not being available. You can retrieve the identifier by name and check if it is 0. In that case, trying to fetch the resource will fail with Resources.NotFoundException.


Setup
=====

Simply add the 'NativeResources.jar' file to your build path. You can download it from the [release section](https://github.com/negusoft/NativeResources/releases).

[In fact, there is only a single class in the library so you can just copy it to your project or copy-past the functions 
you need...]


Usage
=====

You can call any of the static methods of NativeResources and pass the name of the resource to get the identifier. You might then use this value as you would use an identifier taken from the "R" class.

For example, we retrieve a native drawable and set it as the background of our view:
``` java
  View view = ...;
	int drawableId = NativeResources.getDrawableIdentifier("btn_check_buttonless_on");
	view.setBackgroundResource(drawableId);
```

Or you could have used the id to get the drawable itself by calling the getDrawable() method in Resources:
``` java
	int drawableId = NativeResources.getDrawableIdentifier("btn_check_buttonless_on");
	Drawable drawable = getResources().getDrawable(drawableId);
```

NativeResources class allows you to get the data in one step. For example, the code above is equivalent to this:
``` java
	Drawable drawable = NativeResources.getDrawable("btn_check_buttonless_on");
```


Resource Names
==============

Now, where to find the resource names we pass as parameters? You actually have access to them since Android is an open-source platform but it will sometimes require some reverse ingeneering.

You can find the resources in your SDK direcotry in the following path:

"[SDK-root]/platforms/android-X/data/res"

Notice "android-X" in the path. X is the version of the platform. This also means that you have to be careful because a given asset might be available only in some versions of the platform (as explained in the disclaimer.


License
=======

    Copyright 2014 NEGU Soft

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
