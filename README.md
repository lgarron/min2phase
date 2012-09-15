# min2phase Cross-Compilation to Objective C.

Using [j2objc](http://code.google.com/p/j2objc/).

- Working, but rough and slow right now.
- Java classes have no packages at the moment, to make compilation simpler.
- `indexOf` in `Search.java` needed a workaround.
- Some I/O and threading code removed from `Tools.java` to help cross-compilation.
- `J2OBJC_DISTRIBUTION` has to be set in `test-objc.sh`
- Only tested on OSX.