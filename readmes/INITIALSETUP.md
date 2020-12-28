# Setting Up Your Environment

1. Install [git](https://git-scm.com/downloads).
1. Install [Eclipse](https://www.eclipse.org/downloads/). You only need the basic version for Java Developers, but if you have something more already, that should be fine.
1. Install the [Checkstyle](https://checkstyle.org/eclipse-cs/#!/install) plugin.
1. Update your Eclipse settings
   - Set Eclipse to use spaces instead of tabs.
     1. In Window -> Preferences or Eclipse -> Preferences, type "tab" into the search box.
     1. Under General -> Editors -> Text Editors, check "Insert Spaces For Tabs".
     1. Under Java -> Code Style -> Formatter, click "Edit..."
     1. Under Indentation, change Tab Policy to "Spaces Only". Indentation size and tab size should be set to four.
   - Set Eclipse to launch the previously launched application. This makes it easier to keep running your unit tests while editing.
     1. In the search box, type "launch".
     1. Under Run/Debug -> Launching, select "Always launch the previously launched application".
