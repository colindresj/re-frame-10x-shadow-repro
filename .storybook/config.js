import { configure } from '@storybook/react';

const requireStories = require.context(
  '../out/storybook',
  true,
  /repro.stories.[\w]+.js$/
);

function loadStories() {
  requireStories.keys().forEach((filename) => requireStories(filename));
}

configure(loadStories, module);
