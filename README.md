
Kt Xtension
============

Group of usseful kotlin extension I made for application development in kotlin language
and I will keep using them and edit them :)

__Viewpager Xtension__
```java
    viewPager.onPageSelected { pageNo ->
        supportActionBar.apply {
          when (pageNo) {
            0 -> {
              title = "First Page"
            }
            1 -> {
              title = "Second Page"            
            }
          }
        }
      } 
```
__Context Xtension__

```java
  // To send email (Can use in activity, fragment, custom view, application classes)
  email("sample@email.com", "sample body")
  
  // To show toast
  toast("Hello World!")
```
    
__String Xtension__
```java
  "i am kailash dabhi".capitalizedWord() // outputs "I Am Kailash Dabhi"
```
License
-------

    Copyright 2017 Kailash Dabhi (Kingbull Technology)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.