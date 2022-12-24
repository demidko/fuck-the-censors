const displayTimeMs = 1000
let lastNotificationTimestamp = 0
const maxDurationBetweenNotifications = displayTimeMs * 2

export async function copyToClipboard(text) {
  if(!text) {
    return
  }
  await navigator.clipboard.writeText(text)
  if (shouldNotify()) {
    showNotification()
  }
}

function showNotification() {
  $.toast({
    displayTime: displayTimeMs,
    class: "success",
    showIcon: "copy",
    message: "Text copied to clipboard"
  });
  lastNotificationTimestamp = Date.now()
}

function shouldNotify() {
  const lastNotificationAgo = Date.now() - lastNotificationTimestamp
  return lastNotificationAgo > maxDurationBetweenNotifications
}