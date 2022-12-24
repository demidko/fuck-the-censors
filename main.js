// noinspection JSUnresolvedFunction

import {obfuscate} from "./replacer.js";

window.obfuscateTextarea = async function (textarea) {
  let resultContainer = document.getElementById("result-container")
  resultContainer.hidden = false
  resultContainer.value = obfuscate(textarea.value)
  resultContainer.setSelectionRange(textarea.selectionStart, textarea.selectionEnd)
  await navigator.clipboard.writeText(resultContainer.value)
  $(".ui.toast").toast("destroy")
  $.toast({
    class: "success",
    showIcon: "copy",
    message: "Text copied to clipboard"
  });
}