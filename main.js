// noinspection JSUnresolvedFunction

import {obfuscate} from "./replacer.js";

let lastNotificationTimestamp = 0

window.obfuscateTextarea = async function (textarea) {
  let resultContainer = document.getElementById("result-container")
  resultContainer.hidden = false
  resultContainer.value = obfuscate(textarea.value)
  resultContainer.setSelectionRange(textarea.selectionStart, textarea.selectionEnd)
  await navigator.clipboard.writeText(resultContainer.value)
  let displayTimeMs = 1000
  let lastNotificationAgo = Date.now() - lastNotificationTimestamp
  if (lastNotificationAgo > (displayTimeMs * 2)) {
    $.toast({
      displayTime: displayTimeMs,
      class: "success",
      showIcon: "copy",
      message: "Text copied to clipboard"
    });
    lastNotificationTimestamp = Date.now()
  }
}