// noinspection JSUnresolvedFunction

import {obfuscated} from "./obfuscator.js";
import {copyToClipboard} from "./clipboard.js";

window.obfuscate = async function (textarea) {
  const text = obfuscated(textarea.value)
  printlnSynchronously(text, textarea)
  await copyToClipboard(text)
}

function printlnSynchronously(text, caret) {
  const container = document.getElementById("result-container")
  container.value = text
  container.hidden = !text;
  container.setSelectionRange(caret.selectionStart, caret.selectionEnd)
}