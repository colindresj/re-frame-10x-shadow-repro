# re-frame-10x-shadow-repro

Unable to run re-frame-10x alongside React [storybook](https://github.com/storybooks/storybook)
when using shadow-cljs.

Get the following React render error:

```
Warning: React.createElement: type is invalid -- expected a string (for built-in components) or a class/function (for composite components) but got: object.

Check the render method of `day8.re_frame_10x.utils.re_com.v_box`.
    in day8.re_frame_10x.utils.re_com.v_box (created by day8.re_frame_10x.view.app_db.pod_section)
    in day8.re_frame_10x.view.app_db.pod_section (created by day8.re_frame_10x.utils.re_com.v_box)
    in div (created by day8.re_frame_10x.utils.re_com.v_box)
    in day8.re_frame_10x.utils.re_com.v_box (created by day8.re_frame_10x.view.app_db.render)
    in day8.re_frame_10x.view.app_db.render (created by day8.re_frame_10x.utils.re_com.v_box)
    in div (created by day8.re_frame_10x.utils.re_com.v_box)
    in day8.re_frame_10x.utils.re_com.v_box (created by day8.re_frame_10x.view.container.devtools_inner)
    in div (created by day8.re_frame_10x.view.container.devtools_inner)
    in day8.re_frame_10x.view.container.devtools_inner (created by devtools outer)
    in div (created by devtools outer)
    in div (created by devtools outer)
    in devtools outer (created by day8.re_frame_10x.devtools_outer)
    in day8.re_frame_10x.devtools_outer
```

## Repro Steps

1. Repro project uses `deps.edn`, so [install](https://clojure.org/guides/getting_started)
   Clojure if you don't have it
2. `yarn install`
3. `yarn run shadow-cljs` and keep alive
4. In another terminal, run `yarn run storybook`
5. Open browser to `http://localhost:5858` and verify working React components
6. Uncomment, re-frame-10x preload in `src/repro/stories/core.cljs`. See
   console error `React.createElement: type is invalid -- expected a string ...`
