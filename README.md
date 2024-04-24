# Demonstration of issue

```
$ npm ci
...
$ npx shadow-cljs compile app
[:demo] Compiling ...
package A had exports, but could not resolve ./foo.js
```

After a few seconds, you will see an error related the relative import `A/foo.js` in `B/src/two.js`.

# Working around the issue

Open `packages/B/src/two.js` and remove the file-extension from the import. After doing so, compilation succeeds.

```
$ npx shadow-cljs compile app
[:demo] Compiling ...
[:demo] Build completed. (52 files, 0 compiled, 0 warnings, 1.52s)

$ node public/js/main.js
bar is 84 baz is 126
```
