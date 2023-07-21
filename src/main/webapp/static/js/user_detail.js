document.addEventListener("DOMContentLoaded", () => {
  const userList = document.querySelector("table.userList");

  const userClickHandler = (e) => {
    const target = e.target; // li
    if (target.tagName === "TD") {
      const targetClassName = target.className;
      let URL = `${rootPath}/user/detail?ucode=` + targetClassName;
      document.location.href = URL;
    }
  };
  userList?.addEventListener("click", userClickHandler);
});
